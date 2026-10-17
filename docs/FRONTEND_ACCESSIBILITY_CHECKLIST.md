# Frontend Accessibility Checklist

Use this checklist when adding or reviewing screens and reusable components.

## Navigation and structure
- [ ] Use semantic headings in a logical order.
- [ ] Ensure interactive elements can be reached and operated by keyboard.
- [ ] Provide visible focus indicators.
- [ ] Use buttons for actions and links for navigation.

## Forms
- [ ] Associate each input with a visible label.
- [ ] Explain required fields and validation errors in text.
- [ ] Keep error messages close to the relevant field.
- [ ] Do not rely on color alone to communicate success or failure.

## Visual content
- [ ] Provide meaningful alternative text for informative images.
- [ ] Use empty alternative text for purely decorative images where appropriate.
- [ ] Check text contrast and zoom/responsive layouts.
- [ ] Avoid conveying important information only through icons.

## Verification
- [ ] Test primary flows using keyboard-only navigation.
- [ ] Check narrow viewport behavior.
- [ ] Review browser console errors and failed requests.
- [ ] Re-test accessibility after changing shared components.