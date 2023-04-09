@smoke
Feature: User order a product

  Scenario: User order a product without enter personal information
      Given User select english language
      When User select iphone from shop by brand section
      And User select one of the products
      And User add product into basket
      And User click on basket icon
      And User click on proceed to checkout
      And User select city cairo and district ain shams from delivery options
      And User press deliver to my address
      And User fill address fields with details
      And User press address continue button
      And User skip personal information and press continue
      Then User shown an error message returned from full name field



