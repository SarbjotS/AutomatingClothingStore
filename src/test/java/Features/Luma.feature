Feature: Place orders on the dummy website Luma

  Background:
  Given The user is on the Luma homepage

    @Shirt
    Scenario Outline:The user is purchasing a Shirt
      When the "<User>" decides to buy "<clothes>"
      And the user filters how much they wish to "<spend>", "<color>" and "<size>"
      And rolls a dice depending on the number of options presented and selects the option
      And enters selects the options on the details page and adds to cart
      And then proceed to checkout and input shipping address
      Then the user reviews the order and submits
      Examples:
        | User | clothes | spend | color | size |
        | male | shirt   | 50    | Blue  | S