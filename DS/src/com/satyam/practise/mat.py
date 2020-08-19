import copy


def pos(s):
    for i in range(3):
        for j in range(3):
            if s[i][j] == 0:
                return i, j


def next_state_l(s, i, j):
    s1 = copy.deepcopy(s)
    if j <= 0:
        return -1
    s1[i][j], s1[i][j - 1] = s1[i][j - 1], s1[i][j]
    return s1


def next_state_r(s, i, j):
    s1 = copy.deepcopy(s)
    if j >= 2:
        return -1
    s1[i][j], s1[i][j + 1] = s1[i][j + 1], s1[i][j]
    return s1


def next_state_t(s, i, j):
    s1 = copy.deepcopy(s)
    if i <= 0:
        return -1
    s1[i - 1][j], s1[i][j] = s1[i][j], s1[i - 1][j]
    return s1


def next_state_b(s, i, j):
    s1 = copy.deepcopy(s)
    if i >= 2:
        return -1
    s1[i][j], s1[i + 1][j] = s1[i + 1][j], s1[i][j]
    return s1


def com(l1, l2):
    return l1 == l2


s = [[1, 2, 3], [8, 0, 4], [7, 6, 5]]
g = [[2, 8, 1], [0, 4, 3], [7, 6, 5]]
i, j = pos(s)
l1 = []
l1.append(s)
l = []
while (1):
    q = l1.pop(0)
    l.append(q)
    #     print(l1)
    #     print(q)
    if q == -1:
        continue
    if (com(q, g)):
        print(q)
        break
    i, j = pos(q)
    q1 = next_state_t(q, i, j)
    if q1 not in l:
        l1.append(q1)
    q2 = next_state_b(q, i, j)
    if q2 not in l:
        l1.append(q2)
    q3 = next_state_l(q, i, j)
    if q3 not in l:
        l1.append(q3)
    q4 = next_state_r(q, i, j)
    if q4 not in l:
        l1.append(q4)
#     print("-----")