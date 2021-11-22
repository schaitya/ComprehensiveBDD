Feature: BigSmall Site AutoMate

Scenario: BigSmall contact page Validation

Given User lands on Home Page
When click contact us tab in footer
And Enter the name "CHAITYA" email "HELLO123@gmail.com" and message "Product testing" and click on send
Then Thankyou message displayed 
