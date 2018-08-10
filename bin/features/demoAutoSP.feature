#Author: jhvergar@choucairtesting.com
@tag
Feature: Fill Form in Demo Site Using Screen Play

  @SuccessEscenary1
  Scenario: Success Escenary
    Given Carlos wants to access the Web Automation demonstration site
    When he performs the registration on the page using the following data
      | fullname1 | fullname2 | address         | email                   | phone      | gender | hobbies | languages | skills  | country  | select | year | month     | day | pass            | confirm         |
      | Humberto  | vergara   | calle 44 107 11 | julianhumvl07@gmail.com | 3505840027 | Male   | Movies  | Spanish   | Android | Colombia | India  | 1989 | September |  23 | Mefsddsf123456@ | Mefsddsf123456@ |
    Then he verifies that the screen is loaded with text Double Click on Edit Icon to EDIT the Table Row
