UPC integrity checker
===

Just a Clojure library I wrote while learning Clojure.

<p align="center">
  <img src=http://www.reactiongifs.com/r/werd.gif>
</p>

Usage
------

```clojure
(require 'upc-integrity.core)

(upc-integrity.core/check-upc-integrity "013800151735") ; => true
```

Tests
-----

Currenty, I'm using `lein test` though is kinda slow.

```bash
$ lein test
```

Is it done?
-----------

Yup! :sparkles:
