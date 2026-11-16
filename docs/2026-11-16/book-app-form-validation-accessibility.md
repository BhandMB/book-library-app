# Book App Form Validation Accessibility

## Requirements
- Associate each input with a persistent accessible label.
- Identify invalid fields in text, not color alone.
- Connect field-level error messages to their inputs.
- Move focus to a useful location after failed submission.
- Preserve valid user input when server-side validation fails.

## Test cases
Submit an empty form, malformed values, and a form with multiple errors. Verify keyboard-only operation and screen-reader announcement of validation feedback.