# TDD-Mocking-Exercise

1. Implement the `MailService` class TDD style, by using a fake for the `MailServer` interface (the params of the `sendMail` method need be provided to the `MailServer` class as a single String, with `;` as the delimiter. You can ignore any case of delimiter appearing inside the actual field.)
2. Implement the `BookPersistenceService` class TDD style, by using Mockito mocks and stubs in order to verify, that the `BookDatabase` interface is used correctly.