# base-testtask
Test task for Base, Krakow

###Explanation of test usage
Test suite contains two identical test cases for now, that change status name of the lead from 'New' to 'CustomName'.
When any of the cases pass, the status name is changed irreversibly, so that the second one would fail, because it can't find status with name 'New'.
It is possible to implement useful 'aftercase' procedure to reverse the changes.

For now to reset the status to 'New', you should use credentials located in "base-testtask/src/main/java/com/testbase/driver/Config.java" class (email, word), login into the base platform and manually change the status name.
