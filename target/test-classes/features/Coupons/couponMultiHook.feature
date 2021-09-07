Feature: Coupons

 # Background:
 #Given   user enters the coupon website



  @couponMultiHook
  Scenario Outline: multi-hook coupon
    Given that the user enters the coupon website
    When you enter yourMultiHook <document number>
    And click a multi-hook coupon
    Then you can view the detail of a multi-hook coupon
    Examples:
      | document number |
      |72209308                 |