assignment 2 part 1.



note that in the aircraft class,  the teacher wants us to use"enums".
These are special types  that have a fixed number of constants and can be
used for "enumerating" different values for a set variable. Useful to use
them instead of of using different numbers with each number standing for
a specific situation, like we had in the battleship class. (when we had
0 = empty water, 1 = player ship, 2 = player grenade...)

you can define them like this:

`enum public enumTypeName = {ENUMVAL1, ENUMVAL2, ENUMVAL3};`

*(^^^^^ think of this definition as the blueprint, or the "class")*

and put that either in its own file, either in a class file. If you do
the later (which I did for this assignment), then you can then create
one (in the class that they are defined in) like this:

`private enumClassName valName = enumTypeName.ENUMVAL2;`

*(^^^^^ think of this as the "instance" of the "class")*

or like this, in another class ( as I do in Test.java):

`private enumClassName valName = ClassName.enumTypeName.ENUMVAL3;`

*(^^^^^ think of this as the "instance" of the "class")*
