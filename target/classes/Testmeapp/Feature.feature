Feature:Testmeapp
Testing the designed Testmeapp

Scenario:Opening browser
Given user opens the browser
Then click signup
And enter username as "siva1714"
Then enter firstname as "siva"
Then enter lastname as "kishore"
Then enter password as"siva14@12"
Then enter password for confirmation as "siva14@12"
Then choose the gender as 1
Then enter e-mail address as "ksr1997siva@gmail.com"
Then enter mobile number as "3465791321"
Then enter date of birth as "14/07/1987"
Then enter address as "Tirunelveli"
Then choose security question as 1
And enter the answer for the security question as "blue"
And validate the regstration

 
When entering username as string
When entering password as string
Then click Submit
Then Validate login success
When user entering search product as {string}
Then application display search related items
When user click on Add to cart
When The product should added to cart item
When user performs payment through netbanking
Then close application