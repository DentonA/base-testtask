# base-testtask
Test task for Base, Krakow

###Explanation of test usage
Test suite contains two identical test cases for now (using pure selenium and selenium+BaseAPI), that change status name of the lead from 'New' to 'CustomName'.
When any of the cases pass, the status name is changed.
AfterMethod is implemented to reverse the changes.

Test account credentials and access-token for API are located in src/main/java/com/testbase/driver/Config.java class.
