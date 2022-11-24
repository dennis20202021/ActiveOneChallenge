@regression
Feature: Create new referral in Noah web app

  Rule: As an online customer, I need to create referrals, so that I can register invoices to realize payments.

    Background:
      Given Online user navigates to Noah login home page
      When he types valid credentials to login
      And he performs click on 'Ingresar' button

      @create_new_referral
      Scenario: Create new referral
        And he performs click on 'Transacciones' option
        And he performs click on 'Remisiones' from list options
        And he performs click on 'Crear remisión' button link
        And he selects id type
        And he selects customer
        And he selects payment way
        And he types some notes
        And he deletes default item
        And he adds products, services or plans
        And he adds products, services or plans quantity
        And he adds discounts by value or percentage if applicable to products, services or plans
        Then he verifies total for each value added
        When he performs click on save button
        Then he validates register saved successfully

