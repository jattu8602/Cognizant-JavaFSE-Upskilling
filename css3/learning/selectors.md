# CSS3 Selectors

CSS selectors are used to "find" HTML elements to style. Categories:

1. Simple selectors (by name, id, class)
2. Combinator selectors (based on relationships)
3. Pseudo-class selectors (based on state)
4. Pseudo-element selectors (style part of an element)
5. Attribute selectors (by attribute or attribute value)

## Simple Selectors

### Universal Selector (`*`)

Selects **all** elements on the page:

```css
* { margin: 0; padding: 0; }
```

### Element (Type) Selector

Selects all elements of a given type:

```css
p { color: red; }
h1 { text-align: center; }
```

### ID Selector (`#`)

Selects a **single unique** element by its `id` attribute:

```css
#header { background: navy; }
#para1 { text-align: center; color: red; }
```

- An id **must be unique** within a page
- Cannot start with a digit

### Class Selector (`.`)

Selects all elements with a specific `class` attribute:

```css
.center { text-align: center; color: red; }
```

- Element-specific class: `p.center` (only `<p>` with class="center")
- Multiple classes: `<p class="center large">`
- Cannot start with a digit

### Grouping Selector

Apply same styles to multiple selectors (separated by comma):

```css
h1, h2, p { text-align: center; }
```

## Combinator Selectors

| Combinator | Symbol | Example | Description |
|---|---|---|---|
| Descendant | (space) | `div p` | All `<p>` inside `<div>` (any depth) |
| Child | `>` | `div > p` | Direct children only |
| Adjacent Sibling | `+` | `div + p` | `<p>` immediately after `<div>` |
| General Sibling | `~` | `div ~ p` | All `<p>` siblings after `<div>` |

```css
/* Descendant */
div p { color: blue; }

/* Child */
div > p { color: red; }

/* Adjacent Sibling */
h2 + p { font-weight: bold; }

/* General Sibling */
h2 ~ p { margin-left: 20px; }
```

## Pseudo-classes

Target elements based on **state** (not just the element itself):

### Interactive Pseudo-classes

```css
/* Links / buttons */
a:link      { color: red; }    /* unvisited */
a:visited   { color: purple; } /* visited */
a:hover     { color: green; }  /* mouse over */
a:active    { color: blue; }   /* on click */

/* Form elements */
input:focus     { border: 2px solid blue; }
input:disabled  { background: #eee; }
input:checked   { outline: 2px solid green; }
```

### Structural Pseudo-classes

```css
/* First/last children */
li:first-child     { font-weight: bold; }
li:last-child      { border: none; }
li:only-child      { color: gold; }

/* Nth child */
li:nth-child(2)       { color: red; }       /* 2nd child */
li:nth-child(odd)     { background: #f2f2f2; }
li:nth-child(even)    { background: #fff; }
li:nth-child(3n+1)    { /* every 3rd starting at 1 */ }

/* Of-type variants */
p:first-of-type   { font-size: 1.2em; }
p:last-of-type    { margin-bottom: 0; }
p:nth-of-type(2)  { color: blue; }

/* Empty / negation */
div:empty       { display: none; }
p:not(.special) { color: gray; }
```

## Pseudo-elements

Style **parts** of an element (not whole elements):

```css
/* First line/letter */
p::first-line   { font-weight: bold; }
p::first-letter { font-size: 2em; float: left; }

/* Before/after (insert content) */
h2::before      { content: ">> "; color: gray; }
h2::after       { content: " <<"; color: gray; }

/* Selection highlight */
::selection     { background: yellow; color: black; }
```

- Note the double colon `::` for pseudo-elements (CSS3)
- `content` property is required for `::before` and `::after`

## Attribute Selectors

| Selector | Example | Description |
|---|---|---|
| `[attr]` | `[target]` | Elements with attribute |
| `[attr=val]` | `[target="_blank"]` | Exact match |
| `[attr~=val]` | `[class~="flower"]` | Word in space-separated list |
| `[attr^=val]` | `[class^="top"]` | Starts with |
| `[attr$=val]` | `[class$="test"]` | Ends with |
| `[attr*=val]` | `[class*="te"]` | Contains substring |
| `[attr|=val]` | `[lang\|="en"]` | Starts with val or val- |

```css
a[target]           { color: red; }
a[target="_blank"]  { padding: 5px; }
[class~="flower"]   { background: pink; }
[class^="top"]      { border: 1px solid; }
[class$="test"]     { color: green; }
[class*="te"]       { font-size: 1.2em; }
```

## Specificity Hierarchy

When multiple selectors target the same element, specificity decides which wins:

1. **Inline styles** (`style="..."`) - highest
2. **IDs** (`#id`) - 0,1,0,0
3. **Classes, attributes, pseudo-classes** (`.class`, `[attr]`, `:hover`) - 0,0,1,0
4. **Elements, pseudo-elements** (`div`, `::before`) - 0,0,0,1

```css
/* Specificity: 0,1,0,1 */
#nav a { color: red; }

/* Specificity: 0,0,1,1 */
.link a { color: blue; }

/* The id selector wins over class */
```

### `!important`

Overrides all specificity rules:

```css
p { color: red !important; }
```

- Use sparingly (makes debugging hard)
- Overrides inline styles too
- If two `!important` rules conflict, specificity decides

## Key Points

- **ID** is unique per page (use `#`)
- **Class** can be reused (use `.`)
- **Combinators** define relationships (space > + ~)
- **Pseudo-classes** target state (`:hover`, `:nth-child`)
- **Pseudo-elements** target parts (`::before`, `::first-line`)
- **Attribute selectors** match by attribute values
- **Specificity** determines which rule applies when conflicts arise
