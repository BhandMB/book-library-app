# Frontend Form Validation Guide

## Principles
- Validate required fields before submission to give fast feedback.
- Keep server-side validation authoritative; client checks are for usability, not security.
- Use field-level messages that explain how to correct an input.
- Preserve entered values when a request fails for a recoverable reason.
- Avoid showing raw server stack traces or internal error messages.

## UX checklist
- [ ] Associate each input with a visible label.
- [ ] Indicate required fields in text, not color alone.
- [ ] Move focus to the first invalid field when appropriate.
- [ ] Prevent accidental duplicate submission while saving.
- [ ] Announce errors accessibly and keep them near the related control.
- [ ] Clear or update stale errors after the user corrects the field.

## API integration
- Map server validation errors to the relevant field where possible.
- Provide a general message for errors that cannot be mapped to a field.
- Refresh visible data only after a successful mutation.
- Test the form with both successful and rejected API responses.