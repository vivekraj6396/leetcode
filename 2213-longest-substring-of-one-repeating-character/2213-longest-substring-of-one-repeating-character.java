class Solution {

    int[] left;
    int[] right;
    int[] len;
    int[] pre;
    int[] suf;
    int[] best;

    String s;

    public void build(int node, int l, int r)
    {
        if(l == r)
        {
            left[node] = s.charAt(l);
            right[node] = s.charAt(l);
            len[node] = 1;
            pre[node] = 1;
            suf[node] = 1;
            best[node] = 1;
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);

        merge(node, node * 2, node * 2 + 1, l, mid, r);
    }

    public void merge(int node, int a, int b, int l, int mid, int r)
    {
        left[node] = left[a];
        right[node] = right[b];
        len[node] = len[a] + len[b];

        pre[node] = pre[a];
        suf[node] = suf[b];

        if(pre[a] == mid - l + 1 && right[a] == left[b])
        {
            pre[node] += pre[b];
        }

        if(suf[b] == r - mid && right[a] == left[b])
        {
            suf[node] += suf[a];
        }

        best[node] = Math.max(best[a], best[b]);

        if(right[a] == left[b])
        {
            best[node] = Math.max(best[node], suf[a] + pre[b]);
        }
    }

    public void update(int node, int l, int r, int pos, char c)
    {
        if(l == r)
        {
            left[node] = c;
            right[node] = c;
            return;
        }

        int mid = (l + r) / 2;

        if(pos <= mid)
        {
            update(node * 2, l, mid, pos, c);
        }
        else
        {
            update(node * 2 + 1, mid + 1, r, pos, c);
        }

        merge(node, node * 2, node * 2 + 1, l, mid, r);
    }

    public int[] longestRepeating(String str, String queryCharacters, int[] queryIndices)
    {
        s = str;

        int n = s.length();

        left = new int[4 * n];
        right = new int[4 * n];
        len = new int[4 * n];
        pre = new int[4 * n];
        suf = new int[4 * n];
        best = new int[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for(int i = 0; i < queryIndices.length; i++)
        {
            int index = queryIndices[i];

            update(1, 0, n - 1, index, queryCharacters.charAt(i));

            ans[i] = best[1];
        }

        return ans;
    }
}