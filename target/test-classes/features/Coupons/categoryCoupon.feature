Feature: category coupons

  @categoryCoupons
  Scenario Outline:category coupons
    Given User enters the coupon website
    When <user> selects a coupon category
    Then view the coupons of the selected category
    Examples:
      |user|
      |72209308|