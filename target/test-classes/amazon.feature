Feature: To validate the amazon login functionality

Scenario: To validate the invalid credentials 
Given To launch the ChromeBrowser and hit the amazon url
When To pass the invalid credentials to userName field
And click the continue button
And To pass the invalid crediantials to password field
And click the signin button
Then close the browser





Feature: To validate Amazon login functionality

Scenario: To validate invalid credentials
Given To launch the chrome browser and hit the amazon url
When To pass the invalid credentials to username field
And click the continue button
And to pass the invalid credentials to password field
And to click the login button
Then To close the browser


Scenario: To validate the invalid credentials
Given to launch the chrome browser and hit the amazon url
When To pass the invalid credential to username field
And click the continue button
And To pass the invalid credentials to password field
And click the login button
Then To close the browser