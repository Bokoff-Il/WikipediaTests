# Проект по автоматизации тестирования мобильного приложения "Wikipedia"

## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#heavy_check_mark-реализованные-проверки">Реализованные проверки</a>
- <a href="#arrow_forward-запуск-из-терминала">Запуск из терминала</a>
- <a href="#electric_plug-сборка-в-jenkins">Сборка в Jenkins</a>
- <a href="#open_book-allure-отчет">Allure отчет</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#open_book-интеграция-с-allure-testops">Интеграция с Allure TestOps</a>
- <a href="#open_book-интеграция-с-jira">Интеграция с Jira</a>
- <a href="#film_projector-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Appium" src="images/logo/appium.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
<img width="6%" title="AllureTestOps" src="images/logo/AllureTestOps.png">
</p>

## :heavy_check_mark: Реализованные проверки

- Проверка страниц онбординга
- Проверка объявления на стартовой странице
- Проверка сохранения статьи
- Проверка поиска статьи

## :arrow_forward: Запуск из терминала

Удаленно:

```
gradle clean -Dhost=remote
```

Локально:

```
gradle clean -Dhost=local
```

## :electric_plug: Сборка в Jenkins

### <a target="_blank" href="https://jenkins.autotests.cloud/job/012-bokoffil-mobile_diplom/">Сборка в Jenkins</a>

<p align="center">
<img title="Jenkins Dashboard" src="images/screenshots/Jenkins dashboard.png">
</p>  

## :open_book: Allure отчет

- ### Главный экран отчета

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure1.png">
</p>

- ### Страница с проведенными тестами

<p align="center">
<img title="Allure Test Page" src="images/screenshots/allure2.png">
</p>

- ### Страница дашбордов

<p align="center">
<img title="Allure Test Page" src="images/screenshots/allure3.png">
</p>

## :robot: Отчет в Telegram

<p align="center">
<img title="Telegram notification message" src="images/screenshots/telegram.jpg">
</p>

## :open_book: Интеграция с Allure TestOps

<p align="center">
<img title="Allure TestOps" src="images/screenshots/allureTO.png">
</p>

<p align="center">
<img title="Allure TestOps" src="images/screenshots/allureTO1.png">
</p>

## :open_book: Интеграция с Jira

<p align="center">
<img title="Allure TestOps" src="images/screenshots/jira.png">
</p>

## :film_projector: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Видео прохождения теста "Проверка сохранения статьи" представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/screenshots/video.gif">
</p>