# 📚 Quantum Bookstore

Quantum Bookstore is a Java-based application that simulates an extensible online bookstore. It supports multiple book types (paper, ebook, and demo/showcase books), purchasing functionality, and inventory management — all with clean object-oriented design and extensibility in mind.

---

## 🧠 Features

- ✅ Add books to inventory (ISBN, title, author, year, price)
- ✅ Buy books via ISBN, with address/email (depending on type)
- ✅ Remove outdated books (based on age)
- ✅ Automatically handle shipping/email delivery
- ✅ All messages prefixed with: `Quantum book store:`
- ✅ Easily extendable to support new product types

---

## 📦 Book Types

| Book Type     | Attributes                                         | Purchasable | Delivered Via     |
|---------------|-----------------------------------------------------|-------------|--------------------|
| PaperBook     | ISBN, title, author, year, price, `stock`           | ✅          | ShippingService    |
| EBook         | ISBN, title, author, year, price, `fileType`        | ✅          | MailService        |
| ShowcaseBook  | ISBN, title, author, year, price (not for sale)     | ❌          | ❌                 |

---

## 🛒 Purchasing Logic

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

---

## 📤 Services

These are **placeholders** – no implementation required:

- `ShippingService`: Simulates shipping physical books
- `MailService`: Simulates sending ebooks via email

---

## 🧪 Testing

A complete test class is provided:
```java
QuantumBookstoreFullTest.java
