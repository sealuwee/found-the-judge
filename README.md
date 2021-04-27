# found-the-judge

- finding the judge,CS245 assignment lab 8

### Notes before starting:

- In a town, there are N people. There is a rumor that one of these people is secretly the town judge. If the
town judge exists, then:

1) The town judge trusts nobody.
2) Everybody (except for the town judge) trusts the town judge.
3) There is exactly one person that satisfies properties 1 and 2.

 let it be understood that the judge is connected to all vertices on the graph
 as long as judge vertex has a connection to every vertex
 judge trusts noone, but everyone trusts the judge
 judge vertex must always be in the b position of trust[i]=[a,b]
 because a trusts b, does not mean b trusts a
Ordered Pair : A pair in which order matters and changing the order is not allowed is called an ordered pair. ex. (a, b) != (b, a) if a != b

● Each item in the trust array is unique and different

- Should we use a HashMap to implement this?

### Judge implementation

- So I was really thinking about doing something along the lines of having the adjacency matrix be a doubly linked list
- But honestly it was just much easier to make an implementation with a 2d list.
- Despite being incredibly easier, I have to say this is an expensive operation.
- I believe that the running time for findJudge() would be O(n^2) with the two for loops performing some logic by iterating through a data structure of size N. 
- The amout of space allocated to memory would also be around n^2 because we're creating two 1d arrays of values from the 2d array trust. 
- There definitely is a better implementation for this lab. I'm not exactly sure what it is as of 4/27 at 3:24 AM PST, but i'll update the repo if anything comes to mind.