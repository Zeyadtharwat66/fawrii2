
#Purchasing Logic
- Lookup by `ISBN`
- Validate quantity (for PaperBook)
- Send to:
  - `ShippingService` with address (for PaperBooks)
  - `MailService` with email (for EBooks)
- Reduce inventory stock
- Return total price paid
- Errors thrown if:
  - Book doesn’t exist
  - Not purchasable (e.g., ShowcaseBook)
  - Not enough stock
#Features

-  Add books to inventory (ISBN, title, author, year, price)
-  Buy books via ISBN, with address/email (depending on type)
-  Remove outdated books (based on age)
-  Automatically handle shipping/email delivery
-  All messages prefixed with: `Quantum book store:`
-  Easily extendable to support new product types
