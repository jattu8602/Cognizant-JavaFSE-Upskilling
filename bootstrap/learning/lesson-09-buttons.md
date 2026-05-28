# Lesson 9: Buttons

## Button Tags

```html
<button class="btn btn-primary">Button</button>
<a class="btn btn-primary" href="#">Link</a>
<input class="btn btn-primary" type="submit" value="Submit">
<input class="btn btn-primary" type="reset" value="Reset">
```

## Button Colors

```html
<button class="btn btn-primary">Primary</button>
<button class="btn btn-secondary">Secondary</button>
<button class="btn btn-success">Success</button>
<button class="btn btn-danger">Danger</button>
<button class="btn btn-warning">Warning</button>
<button class="btn btn-info">Info</button>
<button class="btn btn-light">Light</button>
<button class="btn btn-dark">Dark</button>
<button class="btn btn-link">Link (looks like an anchor)</button>
```

## Outline Buttons

```html
<button class="btn btn-outline-primary">Primary</button>
<button class="btn btn-outline-danger">Danger</button>
```

## Button Sizes

```html
<button class="btn btn-primary btn-lg">Large</button>
<button class="btn btn-primary btn-sm">Small</button>
<button class="btn btn-primary">Default</button>
```

## Block Buttons

```html
<div class="d-grid gap-2">
  <button class="btn btn-primary">Full width</button>
  <button class="btn btn-secondary">Full width</button>
</div>
```

## Disabled State

```html
<button class="btn btn-primary" disabled>Disabled button</button>
<a class="btn btn-primary disabled" href="#">Disabled link</a>
```

## Button Groups

```html
<div class="btn-group">
  <button class="btn btn-primary">Left</button>
  <button class="btn btn-primary">Middle</button>
  <button class="btn btn-primary">Right</button>
</div>

<!-- Sizing -->
<div class="btn-group btn-group-lg">...</div>
<div class="btn-group btn-group-sm">...</div>

<!-- Vertical -->
<div class="btn-group-vertical">...</div>
```

---

## Interview Questions

**Q: What is the difference between `btn-outline-primary` and `btn-primary`?**
A: `btn-primary` has a solid background with white text. `btn-outline-primary` has no background (transparent) with a colored border; it fills on hover.

**Q: How do you create a full-width button in Bootstrap?**
A: Two ways: add `.w-100` to the button, or wrap it in `<div class="d-grid">` (which creates a block-level container that stretches the button).

**Q: Can an `<a>` tag be styled as a disabled button?**
A: Yes, add `class="btn btn-primary disabled"` to the anchor. However, unlike `<button disabled>`, anchor tags still allow clicks. You must prevent default behavior with JavaScript if needed.

**Q: How do you group buttons together without gaps?**
A: Wrap them in `<div class="btn-group">`. For vertical stacking, use `<div class="btn-group-vertical">`.
