#MaJestiQ#
Yuqi Wu, Jessi Sit, Matteo Wong
Period 3

##Methodology##
We ran QuickSort on arrays of varying length from 1 to 10000, using System.nanoTime() to time their start and end times. Each trial was repeated 10000 times to ensure outliers would not mess up the data set, and then averaged.

##Time Measurements##
Our data can be found here: https://docs.google.com/spreadsheets/d/1t0hJ7D7_WwOhTtF7iWuQBc5BWrOnrcI2-WcOq2Ts5nk/pubhtml
We found that the run time increased linearly. We only put two trials because each trial has 10000 test cases per array length and because all the other ones printed in the terminal were super similar. The line is either diagonal or has a slope that increases at a low rate, which makes it either linear of quadratic.

##Big Oh Classification##

###Best Case###
Best case is when the array gets split exactly in two, because the array is split logn times and each time it is split it will the run O(n) partition() method, resulting in a run time of O(n*logn).

###Average Case###
In the average case the array is split roughly in two, with one end possibly bigger than the other. That will be approximately O(n*logn), because partition() is an O(n) method and roughly chopping the array in two will take logn operations, possibly multiplied by a constant or with a constant added, except we ignore those for Big Oh.

###Worst Case###
The worst case is O(n*n), when the partition always goes to an extreme of the array, because that means instead of dividing the array in two you are only decreasing the length by one, so the O(n) partition method is run n times, creating quadratic run time.

##How pivot selection and data arrangement affect execution time##
A human could carefully analyze a list to realize if the data arrangement or pivot are bad for run time, but at that point you are already solving the list. In essence, it is annoying and nearly impossible to know where your pivot selection is going to go because the array isnt sorted, and thus choosing a specific pivot doesn't help. Similarly, the data arrangement matters, but not in a calculable way.