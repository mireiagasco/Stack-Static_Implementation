# Static Implementation Of A Stack With Java

The methods implemented are the following:\
 -> Constructor: creates an empty stack. The maximum size of the stack must be indicated as an argument.\
 -> Push: adds a new integer to the stack.  The integer must be indicated as an argument.\
 -> Pop: removes and returns the integer on the top of the stack.\
 -> Empty: returns a boolean indicating if the stack is empty or not.\
 -> Size: returns an integer indicating the size of the stack.\
 -> Peek: returns the element on the top of the stack without removing it.

The exceptions used are:\
-> StackIsFull: in case the push() method cannot add a new element to the stack because it's already full.\
-> StackIsEmpty: in case the pop() or peek() methods cannot get the element on the top because the stack is empty.
