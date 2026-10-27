# Frontend Form Accessibility Checklist

**Date:** 2026-10-27  
**Purpose:** Review forms for keyboard, screen-reader, and error-state usability.

## Labels and controls

- [ ] Every input has a programmatic label; placeholder text is not the only label.
- [ ] Required fields are identified in text as well as visually.
- [ ] Related options are grouped with an appropriate fieldset/legend when applicable.
- [ ] Focus order follows the visual and task order.
- [ ] Custom controls expose correct roles, names, and states.

## Validation and submission

- [ ] Errors are written in plain language and identify how to correct the value.
- [ ] Error messages are associated with their fields.
- [ ] Invalid fields are not indicated by color alone.
- [ ] Submission failures preserve safe user-entered values.
- [ ] Loading state prevents accidental duplicate submissions and is announced accessibly.
- [ ] Success and failure feedback is announced without unexpectedly moving focus.

## Keyboard checks

1. Complete the form using only Tab, Shift+Tab, Space, Enter, and arrow keys where appropriate.
2. Confirm focus indicators are visible in all supported themes.
3. Confirm dialogs and menus return focus to the triggering control when closed.
4. Test zoom and narrow viewports so labels and errors remain visible.

Record browser, viewport, assistive technology (if tested), result, and any issue link. Do not mark a check complete unless it was actually performed.