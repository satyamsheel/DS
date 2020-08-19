import numpy as np
import cv2

def click_event(event, x, y, flag, param):
    if event == cv2.EVENT_LBUTTONDOWN:
        print(x, ',' ,y)
        font=cv2.FONT_HERSHEY_COMPLEX
        strXY=str(x) + ', '+ str(y)
        cv2.putText(img, strXY, (x,y), font, 1, (255,125,255), 2)
        cv2.imshow('image', img)



img = np.zeros((512,512,3), np.uint8)
cv2.imshow('image', img)
cv2.setMouseCallback('image', click_event)
cv2.waitKey()
cv2.destroyAllWindows()