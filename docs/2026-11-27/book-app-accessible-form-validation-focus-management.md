# Accessible form validation and focus management

## Expected behavior
Errors must be understandable without relying on color and discoverable by keyboard and assistive technology.

## Interaction rules
- Associate each field with a persistent label and its error text.
- Expose invalid state programmatically and connect the field to its error description.
- On submit failure, focus the first invalid field or an error summary with links.
- Preserve valid values when another field fails.
- Announce asynchronous success/failure through an appropriate live region.
- Do not move focus unexpectedly while the user types.

## Tests
Keyboard-only submission, screen-reader announcement, multiple invalid fields, server validation failure, correction after error, and responsive layout at zoomed text sizes.

## Definition of done
Every error has a textual explanation, field association, and predictable focus behavior. Supplement automated checks with manual keyboard and screen-reader testing.
