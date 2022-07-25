package com.tsybulski.seleniumprojects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TodomvcExamplesbackbonePage {

    public SelenideElement newtodoInput = $("input.new-todo");

    public SelenideElement elementLabel = $(".view label");
}
