package org.active.one.noah.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import org.active.one.noah.task.*;

public class RegisterReferralStepDefinitions {

    @Given("{actor} navigates to Noah login home page")
    public void onlineUserNavigatesToNoahLoginHomePage(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.noahLoginHomePage()
        );
    }

    @When("{actor} types valid credentials to login")
    public void heTypesValidCredentialsToLogin(Actor actor) {
        actor.attemptsTo(
                EnterValid.credentials()
        );
    }

    @And("{actor} performs click on {string} button")
    public void hePerformsClickOnIngresarButton(Actor actor, String textElement) {
        actor.attemptsTo(
                LoginInTo.noahHomePage(textElement)
        );
    }

    @And("{actor} performs click on {string} option")
    public void hePerformsClickOnTransaccionesOption(Actor actor, String option) {
        actor.attemptsTo(
                ClickInThe.optionToDeploy(option)
        );
    }

    @And("{actor} performs click on {string} from list options")
    public void hePerformsClickOnRemisionesFromListOptions(Actor actor, String submenu) {
        actor.attemptsTo(
                SelectOneOption.fromSubmenuTransactionsList(actor, submenu)
        );
    }

    @And("{actor} performs click on {string} button link")
    public void hePerformsClickOnCrearRemisionButtonLink(Actor actor, String textButton) {
        actor.attemptsTo(
                ClickInThe.createReferralButton(textButton)
        );
    }

    @And("{actor} selects id type")
    public void heSelectsIdType(Actor actor) {
        actor.attemptsTo(
                SelectId.type()
        );
    }

    @And("{actor} selects customer")
    public void heSelectsCustomer(Actor actor) {
        actor.attemptsTo(
                SelectCustomer.name()
        );
    }

    @And("{actor} selects payment way")
    public void heSelectsPaymentWay(Actor actor) {
        actor.attemptsTo(
                SelectPayment.way()
        );
    }

    @And("{actor} types some notes")
    public void heTypesSomeNotes(Actor actor) {
        actor.attemptsTo(
                EnterSome.notes()
        );
    }

    @And("{actor} deletes default item")
    public void heDeletesProductByDefault(Actor actor) {
        actor.attemptsTo(
                DeleteDefault.item()
        );
    }

    @And("{actor} adds products, services or plans")
    public void heAddProductsServicesOrPlans(Actor actor) {
        actor.attemptsTo(
                AddNew.item()
        );
    }

    @And("{actor} adds products, services or plans quantity")
    public void heAddsProductsServicesOrServicesQuantity(Actor actor) {
        actor.attemptsTo(
                AddItem.quantity()
        );
    }

    @And("{actor} adds discounts by value or percentage if applicable to products, services or plans")
    public void heAddsDiscountsByValueOrPercentageIfApplicableToProductsServicesOrPlans(Actor actor) {
        actor.attemptsTo(
                AddDiscountBy.valueOrPercentage()
        );
    }

    @Then("{actor} verifies total for each value added")
    public void heVerifiesTotalForEachValueAdded(Actor actor) {
        actor.attemptsTo(
                VerifyTotal.itemsPrice()
        );
    }

    @When("{actor} performs click on save button")
    public void hePerformsClickOnSaveButton(Actor actor) {
        actor.attemptsTo(
                Save.information()
        );
    }

    @Then("{actor} validates register saved successfully")
    public void heValidatesRegisterSavedSuccessfully(Actor actor) {
        actor.attemptsTo(
                ValidateInformation.created()
        );
    }
}
