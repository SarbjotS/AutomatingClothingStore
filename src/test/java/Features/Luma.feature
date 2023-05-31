Feature: Place orders on the dummy website Luma

  Background:
  Given The user is on the Luma homepage

    #Simple buy journey
    @Shirt
    Scenario Outline:The user is purchasing a Shirt
      When the "<User>" decides to buy a "<clothingOption>"
      And the user uses a "<filter>"
      And selects the "<products>" they wish to buy
      And enters the options on the details page and adds to cart
      And then proceed to checkout and input shipping address
      Then selects the next button
      Then the user reviews the order and submits
      Examples:
        | User                      | clothingOption  | products                | filter |
        | sarbjotsingh424@gmail.com | Jackets         | Cassius Sparring Tank   | Color   |


      #Just compare price
      @CompareProducts
      Scenario Outline: The user decides to compare two products
        When the "<User>" decides to buy a "<clothingOption>"
        And the user clicks on "<ProductOne>" and selects the compare button
        And then the user hovers over "<ProductTwo>" and selects the compare button
        Then the user proceeds to the compare page
        And the user selects a "<colour>" and "<size>" and adds the cheaper product to the cart
        And then proceed to checkout and input shipping address
        Then selects the next button
        Then the user reviews the order and submits
        Examples:
          | User | clothingOption | ProductOne | ProductTwo | colour | size |
          | male | shirt | Phoebe Zipper Sweatshirt | placeholder | black | M |


        #Buy 3 tees get 1 free, it'll fail as that functionality doesn't work on site
        #assumption is that the user will select filters which show 4>= products
        @MixAndMatchTee
        Scenario Outline: The user wants to buy 3 tees and get 1 free
          When the User selects the buy three tee get one free promo
          And the user filters how much they wish to "<spend>", "<color>" and "<size>"
          And the user adds first four products to the cart
          And then proceed to checkout and input shipping address
          Then selects the next button
          Then the user checks that they're receiving a free tee
          Then the user reviews the order and submits

          Examples:
            | spend | color | size |
            | 50    | Blue  | S    |

         # @CreateAccount

            #login using account jai41@gmail.com/Jeeper123
         # @Login