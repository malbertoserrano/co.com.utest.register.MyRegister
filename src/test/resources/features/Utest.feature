#Autor: Mario Serrano
@stories
Feature: Utest
  As a user, I want to register in Utest
  @scenario1
  Scenario: Create a new user to login in Utest
    Given that Diana wants to register as a tester in Utest
    When she enters the required data for register
   | strFirstName | strLastName | strEmail         | strCity| strZip | strCountry | strOS | strOsVersion | strOsLang | strMobile | strMobileVersion | strMobileOs | strPassword |
   | Laura|Jimenez|LjimenezC@gmail.com|Villavicencio|500001|Colombia|Windows|11| Spanish|Samsung|Galaxy A|Android 7.1.1|TH15is4P455W0RD|
   Then she finally is registered in Utest platform when sees in page
    | strSuccessSignUp |
    |First, please check your email inbox|