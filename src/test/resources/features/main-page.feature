Feature: Главная страница

  Scenario: Открыть страницу и выполнить проверки
    * Page - open 'Главная страница'
    * Page - get element 'Авторизация' and click
    * Page - check current page 'Логин'
    * Page - get element 'Логин' and set 'тестовый пользователь'
    * Page - get element 'Пароль' and set 'тестовый пароль'
    * Common - wait '1' sec
    * Page - get element 'Войти' and click