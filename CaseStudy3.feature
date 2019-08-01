Feature: User Story Search engine

Scenario: Login and search product to purchase
When user opens testmeapp in browser
Then user click sigin button
When user provide uname as "manoshine" and password as "manoshinee"
Then user click Login button
When user searches for a particular product like headphones
Then user click find details button
When user proceed to payment by addding product to the cart and clicks the Add To Cart button