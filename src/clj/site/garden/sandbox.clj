(ns site.garden.sandbox
  (:require [garden.units :refer [px percent s em]]
            [garden.color :refer [rgb]]
            [site.garden.records :as records]
            [site.garden.hydration-display :as hydration-display]))

(defn export []
  [
   (records/export)
   (hydration-display/export)

   [:.intro
    {:background-color "rgb(241, 255, 124)"
    :padding (px 10)}
    [:p
     {:font-size (px 14)
      :margin 0}]]

   [:header.db-schema
    {:padding [[(px 40) 0]]}
    [:&.collapsed
     {:padding 0}]
    [:p {:margin-bottom (px 20)}]
    [:.expander
     {:color "white"}]]

   [:.half
    {:vertical-align "top"
    :width (percent 50)
    :display "inline-block"}]

   [:.expander
    {:cursor "pointer"}]

   [:.instructions
    {:margin (px 20)
      :color "white"}
    [:p
     {:font-size (px 14)}]]

   [:.examples
    {:text-align "left"
     :background-color "white"}
    [:h3
     {:display "inline-block"
     :margin-right (px 10)}]]

   [:.alert
    {:margin (px 40)
     :padding-bottom (px 40)}
    [:h3
     {:text-transform "none"}]]])
