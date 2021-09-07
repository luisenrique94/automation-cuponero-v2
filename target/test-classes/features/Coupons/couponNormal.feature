Feature: Coupons

 # Background:
 #Given   user enters the coupon website



  @couponNormal
  Scenario Outline: normal coupon
    Given that the user enters the coupon website
    When you enter yourNormal <document number>
    And click on a normal coupon
    Then you can view the detail of a normal coupon
    Examples:
      | document number |
      | 72209308        |