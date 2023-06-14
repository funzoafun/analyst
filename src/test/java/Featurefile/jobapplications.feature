Feature: apply for job

  Scenario: job applications
    Given i am looking on homepage searching for job
    When i click on apply
    Then fill all mandatory field
    |First Name||Surname |Email Address|Mobile Number||Uploadfile|
    |Agnee     ||Patel|xyz@gmail.com|123456789|       |"D:\spring\untitled3\src\main\java\resources\sample_1.png"|

    Scenario Outline: JOB APPLICATIONS

      Given i am looking on homepage searching for job
      When i click on apply
      Then fill all mandatory field Firstname "<first name>" Surname "<surname>" Email "<Emailaddress>" MobileNumber "<Mobile number>" and Uploadfile "<uploadfile>"

      Examples:
      |first name|surname|Emailaddress|Mobile number|uploadfile|
      |AGNEE    |NEMETH |EXAMPLE@gmail.com|1234567890    |"D:\spring\untitled3\src\main\java\resources\sample_1.png\resources\sample_1.png"  |
      |     AGNEE    |NEMETH       |zyr@gmail.com|23456798709   |    .bat   |
      |AGNEE    |NEMETH |EXAMPLE3@gmail.com|1234567890    |        .exe  |
      |     AGNEE    |NEMETH       |example1r@gmail.com|2345679879 |word      |