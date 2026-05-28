# Lesson 10: Forms

## Form Control

```html
<form>
  <div class="mb-3">
    <label for="email" class="form-label">Email</label>
    <input type="email" class="form-control" id="email" placeholder="name@example.com">
  </div>
  <div class="mb-3">
    <label for="password" class="form-label">Password</label>
    <input type="password" class="form-control" id="password">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
```

## Sizing

```html
<input class="form-control form-control-lg" type="text" placeholder="Large">
<input class="form-control form-control-sm" type="text" placeholder="Small">
<input class="form-control" type="text" placeholder="Default">
```

## Disabled / Readonly

```html
<input class="form-control" disabled>
<input class="form-control" readonly value="Cannot edit">
```

## Select

```html
<select class="form-select">
  <option selected>Open menu</option>
  <option value="1">One</option>
</select>

<select class="form-select form-select-lg">...</select>
<select class="form-select form-select-sm">...</select>
```

## Checks and Radios

```html
<div class="form-check">
  <input class="form-check-input" type="checkbox" id="check1">
  <label class="form-check-label" for="check1">Checkbox</label>
</div>

<div class="form-check">
  <input class="form-check-input" type="radio" name="radioGroup" id="radio1">
  <label class="form-check-label" for="radio1">Radio 1</label>
</div>

<!-- Switch toggle -->
<div class="form-check form-switch">
  <input class="form-check-input" type="checkbox" role="switch">
  <label class="form-check-label">Toggle switch</label>
</div>

<!-- Inline -->
<div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox">
  <label class="form-check-label">Inline 1</label>
</div>
```

## Input Groups

```html
<div class="input-group mb-3">
  <span class="input-group-text">@</span>
  <input type="text" class="form-control" placeholder="Username">
</div>

<div class="input-group">
  <input type="text" class="form-control">
  <button class="btn btn-primary" type="button">Search</button>
</div>
```

## Floating Labels

```html
<div class="form-floating mb-3">
  <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
  <label for="floatingInput">Email address</label>
</div>
```

## Form Validation

```html
<form class="was-validated">
  <div class="mb-3">
    <input type="text" class="form-control" required minlength="3">
    <div class="valid-feedback">Looks good!</div>
    <div class="invalid-feedback">Must be at least 3 characters.</div>
  </div>
</form>

<!-- JavaScript validation -->
<form class="needs-validation" novalidate>
  <div class="mb-3">
    <input type="text" class="form-control" id="name" required>
    <div class="invalid-feedback">Required field</div>
  </div>
  <button class="btn btn-primary" type="submit">Submit</button>
</form>

<script>
  const forms = document.querySelectorAll('.needs-validation');
  Array.from(forms).forEach(form => {
    form.addEventListener('submit', event => {
      if (!form.checkValidity()) {
        event.preventDefault();
        event.stopPropagation();
      }
      form.classList.add('was-validated');
    });
  });
</script>
```

---

## Interview Questions

**Q: What does `.form-label` class do?**
A: It styles labels with proper margin and font weight, and ensures they align correctly with `.form-control` elements.

**Q: What is the difference between `form-control` and `form-select`?**
A: `.form-control` is for text inputs, textareas, and file inputs. `.form-select` is specifically for `<select>` dropdowns (different styling and appearance).

**Q: How does floating label work in Bootstrap?**
A: The `.form-floating` wrapper positions the label inside the input. When the input has a value or is focused, the label animates up to sit above the input border. A placeholder is required for this to work.

**Q: How do you show validation feedback in Bootstrap forms?**
A: Use `.valid-feedback` (shown when valid) and `.invalid-feedback` (shown when invalid). Add `.was-validated` to the `<form>` after submission (or use `:valid`/`:invalid` pseudo-classes with `novalidate`).
