(ns firstclojure.lines
  (:require [quil.core :as q]))
            
    
(defn mouse-color [x y]  "Calculate a color based on two values" 
   [(mod x 255)  (mod y 255) 0])
  

(defn draw 
  []
  (q/background 248)
  (apply q/stroke  (mouse-color (q/mouse-x) (q/mouse-y))) 
  (q/line 0 0 (q/mouse-x) (q/mouse-y))  
  (q/line 200 0 (q/mouse-x) (q/mouse-y))  
  (q/line 0 200 (q/mouse-x) (q/mouse-y))  
  (q/line 200 200 (q/mouse-x) (q/mouse-y)))


(defn setup []
  (q/frame-rate 30)
  (q/color-mode :rgb)
  (q/stroke 255 0 0))

(q/defsketch hh
  :title "lines"
  :size [500 500]
  :setup setup
  :draw draw  
  :features [:keep-on-top])
