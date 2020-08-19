import numpy as np
import cv2

img = cv2.imread('apple.jpg', 1)

img = cv2.line(img, (0, 0), (255, 255), (0, 0, 255), 5)
img = cv2.arrowedLine(img, (0, 255), (255, 255), (0, 255, 0), 5)
img = cv2.rectangle(img, (255, 0), (355, 100), (0, 0, 255), 5)
img = cv2.circle(img, (255, 255), 50, (0, 255, 0), 5)
font = cv2.FONT_HERSHEY_COMPLEX
img = cv2.putText(img, 'OpenCv', (10,460), font, 4, (0, 255, 255), 10)

cv2.imshow('Photo', img)

cv2.waitKey(0)
cv2.destroyAllWindows()