### WebDriver Locators

- As part of Automation, Selenium performs actions (such as click, typing) on the page HTML Elements.
- The locators are the way to identify an HTML element on a web page.
- Selenium WebDriver uses any of the below locators to identify the element on the page and performs the action.

1. ID
2. Xpath
3. CSS Selector
4. Name
5. Class Name
6. Tag Name
7. Link Text
8. Partial Link Text

`<input type="text" placeholder="Username" id="inputUsername" value="nagendrareddy29029@gmail.com" fdprocessedid="3mrpzb">`
- input - tag name
- type, placeholder, id - attributes
- text, Username, inputUsername - value

**CSS Selector:** (Tag name is optional)
- If HTML contain class
- Class name - `tagname.classname`
- If HTML contain ID
- ID - `tagname#id`
- If HTML element not contain class or id Then we can write
- `Tagname[attribute='value']` Ex: `input[placeholder='Username']`
- In console $('p.error')
- To use index in CSS we have to use :nth-child(2)
- Traversing from parent to child - `form input[placeholder='Phone Number']`
- `input[placeholder='Username']` if name in value is not constant we can use regular expression `input[placeholder*='User']`
- `input[type='text']:nth-child(2)`

**Xpath:**
- `//Tagname[@attribute='value']`
- Ex: `//input[@placeholder='Username']`
- `//input[@placeholder='Username'][index]`
- Traversing from parent to child - `//form/input[@placeholder='Phone Number']`
- Console: `$x('Tagname[@placeholder="Name"]')`
- `//button[contains(@class,'submit')]` - Regular expression

**Text:**
- `//button[text()='Log Out']`
- Locator with text not possible in CSS

