In a Java class, a static block is a set of instructions that is run only once when a class is loaded into memory.
A static block is also called a static initialization block. This is because it is an option for initializing or 
setting up the class at run-time. The keyword 'static' indicates that it spans all instances of the class. 
It is like a mini-global set of instructions.

On the other hand, constructors are run EACH time a new instance of a class is created. You can overload a constructor,
meaning that multiple versions of the constructor can be created. Each one has to have a different number of parameters,
but, otherwise, they can all be named the same. Let's look at some examples.

Empty block will be called when you are creating the object with new keyword.
Empty block will not get execute if you are not creating the object.
Both static and not static variable can be initialized in empty block.
It will be called before your default constructor, so  preinitialization can be done here.
Instance method and static method can be called form empty block.


Since the static block is always executed first, it doesn't matter in which order it's placed within the class. Typically,
you would want to have the static block listed before constructors for readability, Empty block will becalled before your 
default constructor but Java technically does not care. However, Java will process the static block codes in order.
