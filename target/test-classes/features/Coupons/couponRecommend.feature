Feature: Coupons

 # Background:
 #Given   user enters the coupon website

  @couponRecommend
  Scenario Outline: recommend coupons
    Given that  the user enters the coupon website
    When you enter yourRecommend <document number>
    And click on a coupon
    Then you can view the recommended coupons that the main coupon has
    Examples:
      | document number |
      | 72209308        |


