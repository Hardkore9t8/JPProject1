# JPProjct
This is the first part of a multi-stage project.
Scenario - OraclProduction
OraclProduction Ltd are specialists in producing production line manufacturing plants.
They could be asked to create a production plant for any type of product ranging from a simple packaging
system to a variety of electronic devices.
Recently they have been asked to create a production line for multimedia devices which include music
and movie players. They wish to employee you to design a template in Java for creating and recording all
future production line items. For this particular production facility you will only implement a concrete
class for music and movie players.
Your task is to create a flexible structure that could be used in any production line. This structure would
then allow easy modification to handle different products.
Step 1
Create an interface called Item that will force all classes to implement the following functions.
 A constant called manufacturer that would be set to “OracleProduction”.
 A method setProductionNumber that would have one integer parameter
 A method setName that would have one String parameter
 A method getName that would return a String
 A method getManufactureDate that would return a Date
 A method getSerialNumber that would return an int
Step 2
All items will have a pre-set type. Currently there are 4 types. Create an enum called ItemType that will
store the following information.
Type Code
Audio AU
Visual VI
AudioMobile AM
VisualMobile VM
Step 3
Create an abstract type called Product that will implement the Item interface. Product will implement
the basic functionality that all items on a production line should have. Add the following fields to Product
 int serialNumber
 String manufacturer
 Date manufacuredOn
 String name
Add an integer class variable called currentProductionNumber. This will store the next number to be
assigned to serialNumber.
Complete the methods from the interface Item.
Add a constructor that will take in the name of the product and set this to the field variable name. You
will also assign a serial number from the currentProductionNumber. The currentProductionNumber
should be incremented in readiness for the next instance.
Set manufacturedOn as the current date and time.
Add a toString method that will return the following: (example data shown).
Manufacturer : OraclProduction
Serial Number : 1
Date : Thu May 14 15:18:43 BST 2015
Name : Product Name
