Feature: Coupons

 # Background:
 #Given   user enters the coupon website
  @couponBicanal
  Scenario Outline: Bicanal coupon
    Given that the user enters the coupon website
    When you enter yourBicanal <document number>
    And click on a dual bicanal coupon
    Then you can view the detail of a dual-channel coupon
    Examples:
      |document number|
      |72209308       |


