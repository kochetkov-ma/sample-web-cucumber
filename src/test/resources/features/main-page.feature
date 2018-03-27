Feature: Главная страница

  Scenario: Открыть страницу и выполнить авторизацию
    * Page - open 'Главная страница'
    * Page - execute 'Главное меню.выбрать(БАНК)'
    * Page - execute 'Второе меню.выбрать(Кредит)'
    * Page - check current page 'Кредит наличными'

  Scenario: Открыть страницу и выполнить авторизацию
    * Page - open 'Главная страница'
    * Page - get element 'Авторизация' and click
    * Page - check current page 'Логин'
    * Page - get element 'Логин' and set 'тестовый пользователь'
    * Page - get element 'Пароль' and set 'тестовый пароль'
    * Page - get element 'Войти' and click
    * Page - get text and save to 'result'
    * Verify - contains string expected 'Введён неверный логин или пароль' to actual '${result}'

  