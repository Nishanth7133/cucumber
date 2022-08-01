Feature: To validate the facebook login funcationality

  Scenario: To validate the invalid credentials
    Given To launch the chromeBrowser and hit the facebook url
    When To pass the invalid credential to username field
      |email1| nishanthm@gmail.com |
      |email2| nishaneee@gmail.com | 
      |email3|keerthana@gmail.com | 
      |email4|malarvizhi@gmail.com | 
      |email5|dharani123@gmail.com |
    And To pass the invalid credential to password field
      |pass1         |pass2         |pass3         |
      |   9837874235 |   3456788666 |    326578795 |
      | 235768585789 | 347586843434 | 347688456736 |
      | nzxnvkjxdg   | ajgnakljg    | ajkengkajf   |
    And click the login button
    And to check the confirm button
    Then To close the chrome browser

  Scenario Outline: To execute the bulk of data
    Given To launch the chromeBrowser and hit the facebook url
    When To pass the bulk of data"<userName>" to the userName field
    And To pass the bulk of data to the "<password>" password field
    And click the login button
    And to check the confirm button
    Then To close the chrome browser

    Examples: 
      | userName             | password   |
      | nishanthm@gmail.com  | 9876543210 |
      | nishaneee@gmail.com  | 0123456789 |
      | keerthana@gmail.com  | 8765432109 |
      | malarvizhi@gmail.com | 7654321098 |
      | dharani123@gmail.com | 6543210987 |





Scenario Outline: To execute the bulk of data
    Given To launch the chromeBrowser and hit the facebook url
    When To pass the bulk of data"<userName>" to the userName field
    And To pass the bulk of data to the "<password>" password field
    And click the login button
    And to check the confirm button
    Then To close the chrome browser

    Examples: 
      | userName             | password   |
      | nishanthm@gmail.com  | 9876543210 |
      | nishaneee@gmail.com  | 0123456789 |
      | keerthana@gmail.com  | 8765432109 |
      | malarvizhi@gmail.com | 7654321098 |
      | dharani123@gmail.com | 6543210987 |


Scenario: To validate the invalid credentials
Given To launch the chrome browser and hit the facebook url
When to pass the invalid credential to username field
|nishanthmmmmm@gmail.com|nishanthsssssss@gmail.com|nishanthdddddd@gmail.com|nishanhnnnnnn@gmail.com|
And to pass the invalid credential to password field
|9876543210|8765432109|7654321098|
|6543210987|5432109876|4321098765|
|3210987654|2109876543|1098765432|
And click the login button
Then close the browser      
      
