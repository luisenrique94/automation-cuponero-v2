Feature: Coupons

 # Background:
 #Given   user enters the coupon website
@couponFlash
Scenario Outline: Flash coupon
Given that the user enters the coupon website
When you enter yourFlash <document number>
And click on a flash coupon
Then you can view the detail of a flash coupon
Examples:
|document number|
|72209308       |