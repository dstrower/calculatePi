# calculatePi
Calculate __&pi;__ 
This program calculates the number __&pi;__

Usually this done using an infinate series. However, it can also be calculated using the randon number generator.

Suppose we have the following: 
* Theere is a square with sides of length 2 centered at the origin. 
* There is a circle with radius of 1 centered at the origin.
* Now suppose a point __P(x,y)__ is randomly generated with the values for __x__ and __y__ being between -1 and 1.

This is shown in the following diagram
![Basic Concept](images/circle.jpg?raw=true "Title")

Now let __P<sub>c</sub>__ = the probability that point P is inside the circle.

This can be calculated by dividing the area of the cirle by the area of the sqaure.

The area of the square is (2)(2) = 4.

The area of the cirlce is __r<sup>2</sup> &pi;__ where __r__ is 1 so the area of the cirle is just __&pi;__

![Basic Concept](images/equation1.jpg?raw=true "Title")

Now we can solve for __&pi;__ and get __&pi;__ = 4(__P<sub>c</sub>__)

The value for P<sub>c;</sub> will be determined by the program experimentaly. 
1. The variables __attempts__ and __success__ will be set to 0.
2. An infiniate loop will start.
3. The variables __x__ and __y__ will be randomly generated to be a value from -1 and 1. This is the random point __P(x,y)__.
4. Then the variable __attempts__ be incremented. 
5. Then it will be determined if the random point is in the circle.
6. Calculate the distance __d__ which is the distance from the center of the cirlce to  __P(x,y)__.
7. This can be using the  Pythagorean theorem using __x__ and __y__

![Basic Concept](images/pythag.jpg?raw=true "Title")

8. If the distance __d__ is less than 1, then increment __success__
9. Calculate P<sub>c</sub> 

![Basic Concept](images/success.jpg?raw=true "Title")

10. Calculate &pi; by using equation __&pi;__ = 4(__P<sub>c</sub>__)
11. Print out  &pi; every so often. Since ```System.out.println``` is slow, only print it once out every 100,000 times.
12. End the loop.

The program will quickly converge to about 3.141. It is not real accurate but it does illustrate the concept.
