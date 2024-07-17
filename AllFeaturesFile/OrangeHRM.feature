#Feature: Test OrangeHRM Application

 # Scenario: Validate LoginPage Functionality
  #  Given user is on LoginPage
  #  When user enter a valid UserName and PassWord and click the Login button
  #  Then user is on  HomePage and validate the HomePageTitle
   # And validate HomePage URL

  #Scenario: Validate PIM Page Functionality
   # When user is on PIM Page
   # Then validate PIM Page URL

  #Scenario Outline: 
   # When user click on Add Employee
   # And user enter valid "<FirstName>", "<MiddleName>" , "<LastName>" and click on Save button
    #And user capture the EmployeeId
   # And user click on Add EmployeeList
   # And user enter the EmployeeId and click on Search Button
   # And user select searched EmployeeId and click on delete
    #Then validate confirm delete window and click on yes deleted

    #Examples: 
    #  | FirstName | MiddleName | LastName |
    #  | Sonali    | Subhash    | Khalate  |
     # | Shivanya  | Subhash    | Khalate  |
     # | Nikhil    | Subhash    | Khalate  |
     # | Sushant   | Shekhar    | Bhosale  |

  #Scenario: Validate Logout Functionality
   # When user click on Profile image
   # When user click on Logout button
