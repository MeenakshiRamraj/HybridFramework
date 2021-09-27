Feature: Testing the UrbalLadder website

Scenario: Logging in into the homepage
Given user is on the landing page of the UrbanLadder website  
When user logs in with valid emailID and password 
Then user is loggged in to their account 



Scenario: Displaying the paragraph in the LoveSeats page
Given user is on the landing page
When user hovers on the living icon and clicks on the loveseats
Then browser redirects to the loveseats page
And prints the description paragraph


Scenario: To verify Giftcards page
Given user is on the landing page  
When user clicks on the giftcards icon and redirected
Then user selects an Occassion enters amount and selects month and delivery
And enters email and name
Then confirms the details



Scenario: verify helppage
Given user is on the landing page 
When clicked on the help icon and redirected
And user types the question in search area

Scenario: search a product by applying filters
Given user is on the landing page
When hover on living and clicks loveseats
And hovers on filter and filter is chosen products displayed
And Prints the name of the products

Scenario: Displaying count of items
Given user is on the landing page 
When hover on sale and clicks on study table
Then list will be displayed and count is printed


Scenario: Checking the count of decor
Given user is on the landing page 
When clicked on the decor icon redirected to decor page and list is displayed 
And Count of items displayed is checked
And Browser is closed

